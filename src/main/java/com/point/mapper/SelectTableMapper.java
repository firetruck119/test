package com.point.mapper;

import com.point.newPDF.entity.select.DataTableEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SelectTableMapper {

   List<DataTableEntity> getAll();

   DataTableEntity getOne(String tablesymbol);

   int insertTable(DataTableEntity entity);

   int deleteById(int id);

   int updataById(DataTableEntity entity);

   int deleteColumnByTableId(int tableId);



   int inesrtColumnJson(DataTableEntity entity);

   List<DataTableEntity> getAllColumnJson(Integer tableid);

   int updateColumnJson(DataTableEntity entity);



   int inesrtRowJson(DataTableEntity entity);

   List<DataTableEntity> getAllRowJson(Integer tableid);

   int updateRowJson(DataTableEntity entity);

   int deleteRowByTableId(int tableId);
}
