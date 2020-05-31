package com.point.newPDF.Service;

import com.point.common.CustomerException;
import com.point.mapper.SelectTableMapper;
import com.point.newPDF.entity.select.DataTableEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.Iterator;
import java.util.List;

@Service
public class SelectTabelService {

    @Autowired
    SelectTableMapper selectMapper;
    private void entityIsEmpty(DataTableEntity entity) throws CustomerException {
        if(StringUtils.isEmptyOrWhitespace(entity.getTablename())){
            throw new CustomerException("表格名不许为空");
        }
        if(StringUtils.isEmptyOrWhitespace(entity.getTablesymbol())){
            throw new CustomerException("表格符号不许为空");
        }
    }
    private void listHasEntity(List<DataTableEntity> list,DataTableEntity entity) throws CustomerException {
        boolean a=false;
        for(DataTableEntity s : list){
            if(s.getId()== entity.getId())
                continue;
            a=a||s.getTablename().equals(entity.getTablename());
        }
        if(a){
            throw new CustomerException("已存在表格名为"+entity.getTablename());
        }
        for(DataTableEntity s : list){
            if(s.getId()== entity.getId())
                continue;
            a=a||s.getTablesymbol().equals(entity.getTablesymbol());
        }
        if(a){
            throw new CustomerException("已存在表格符号为"+entity.getTablesymbol());
        }
    }

    public List<DataTableEntity> getAll() {
        return selectMapper.getAll();
    }
    public int delete(DataTableEntity e) {
        selectMapper.deleteColumnByTableId(e.getId());
        selectMapper.deleteRowByTableId(e.getId());
        return selectMapper.deleteById(e.getId());
    }
    public int insertTable(DataTableEntity entity) throws CustomerException {
        List<DataTableEntity> list=selectMapper.getAll();
        listHasEntity(list,entity);
        return selectMapper.insertTable(entity);
    }

    public int updataById(DataTableEntity entity) throws CustomerException {
        List<DataTableEntity> list=selectMapper.getAll();
        entityIsEmpty(entity);
        Iterator<DataTableEntity> i=list.iterator();
        while(i.hasNext()){
            if(i.next().getId()== entity.getId()){
                i.remove();
                continue;
            }
        }
        listHasEntity(list,entity);
        return selectMapper.updataById(entity);
    }

    public int inesrtJson(DataTableEntity entity){
        List<DataTableEntity> L=selectMapper.getAllColumnJson(entity.getId());
        if(L.size()<1){
            selectMapper.inesrtColumnJson(entity);
        }else{
            selectMapper.updateColumnJson(entity);
        }
        List<DataTableEntity> rs= selectMapper.getAllRowJson(entity.getId());
        if(rs.size()<1){
            selectMapper.inesrtRowJson(entity);
        }else{
            selectMapper.updateRowJson(entity);
        }
        return 1;
    }

    public DataTableEntity getTable(Integer tableid) throws CustomerException {
        List<DataTableEntity> L=selectMapper.getAllColumnJson(tableid);
        List<DataTableEntity> rs= selectMapper.getAllRowJson(tableid);
        DataTableEntity entity=new DataTableEntity();
        if(L.size()==1){
            entity.setColumnsJSON(L.get(0).getColumnsJSON());
        }else if(L.size()>1){
            throw new CustomerException("列数据错误");
        }else if(L.size()==0){
            throw new CustomerException("没有列数据");
        }
        if(rs.size()==1){
            entity.setRowsJSON(rs.get(0).getRowsJSON());
        }else if(rs.size()>=1){
            throw new CustomerException("行数据错误");
        }else if(rs.size()<1){
            throw new CustomerException("没有行数据");
        }
        return entity;
    }

}
