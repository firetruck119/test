package com.point.enums;

public enum ComponentTypeEnum {
    ComponentBigArm{//大臂
        public int toInt() {
            return 1;
        }
    },
    ComponentPost{//立柱
        public int toInt() {
            return 2;
        }
    },
    ComponentUnderShell{//底架
        public int toInt() {
            return 3;
        }
    },
    ComponentWeight{//配重
        public int toInt() {
            return 4;
        }
    },
    ComponentGondola{//吊船
        public int toInt() {
            return 5;
        }
    },
    ComponentArmEnd{//臂头
        public int toInt() {
            return 6;
        }
    },
    ComponentRotator{//回转机构
        public int toInt() {
            return 7;
        }
    },
    ComponentHoister{//起升机构
        public int toInt() {
            return 8;
        }
    },
    ComponentOperator{//运行机构
        public int toInt() {
            return 9;
        }
    },
    ComponentGlassCrane{//玻璃起吊
        public int toInt() {
            return 10;
        }
    },
    ComponentRope{//钢丝绳
        public int toInt() {
            return 11;
        }
    },
    ComponentTrack{//轨道
        public int toInt() {
            return 12;
        }
    },
    ComponentHydraulicSystem {//液压系统
        public int toInt() {
            return 13;
        }
    },
    ComponentElectricalSystem{//电气系统
        public int toInt() {
            return 14;
        }
    },
}
