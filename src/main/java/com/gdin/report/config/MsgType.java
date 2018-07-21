package com.gdin.report.config;

public class MsgType {
    /**
     * 运抵报告
     */
    private static final String ARRIVAL_DATA="MT3101";
    /**
     * 水运分流运抵
     */
    private static final String DISTRIBUTE_DATA="MT3102";
    /**
     * 预配舱单
     */
    private static final String EXPORT_DATA="MT2101";
    /**
     * 原始舱单
     */
    private static final String IMPORT_DATA="MT1101";
    /**
     * 水运进口理货
     */
    private static final String IMPORT_TALLY_DATA="MT5101";
    /**
     * 水运出口理货
     */
    private static final String EXPORT_TALLY_DATA="MT5102";
    /**
     * 装载舱单
     */
    private static final String LOAD_DATA="MT4101";
    /**
     * 未知数据报文标识
     */
    private static final String UNKNOWDATA="MFT_UNKONW_DATA";
    public static String getArrivalData() {
        return ARRIVAL_DATA;
    }
    public static String getDistributeData() {
        return DISTRIBUTE_DATA;
    }
    public static String getExportData() {
        return EXPORT_DATA;
    }
    public static String getImportData() {
        return IMPORT_DATA;
    }
    public static String getImportTallyData() {
        return IMPORT_TALLY_DATA;
    }
    public static String getExportTallyData() {
        return EXPORT_TALLY_DATA;
    }
    public static String getLoadData() {
        return LOAD_DATA;
    }
    public static String getUnknowdata() {
        return UNKNOWDATA;
    }



}

