package com.insp.cloudtest.util;

public class Constant {

    public enum warehouseEnum{
        SUCCESS(1,"单据操作成功"),
        NOTFIND(0,"未找到单据");

        private int code;
        private String value;

        warehouseEnum(int code, String value) {
            this.code = code;
            this.value = value;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
