package com.gdin.report.config;

public class MsgType {


    /**
     * 1原始舱单
     */
    public static final String IMPORT_SHIP="MT1101";
    public static final String IMPORT_AIR ="MT1201";

    /**
     * 2预配舱单
     */
    public static final String EXPORT_SHIP="MT2101";
    public static final String EXPORT_AIR ="MT2201";


    /**
     * 3.1进口理货
     */
    public static final String Tally_Ship_Import="MT5101";
    public static final String Tally_Air_Import ="MT5201";
    /**
     * 3.2出口理货
     */
    public static final String Tally_Ship_Export="MT5102";
    public static final String Tally_Air_Export ="MT5202";



    /**
     * 4.1运抵报告
     */
    public static final String Arrival_Ship="MT3101";
    public static final String Arrival_Air ="MT3201";


    /**
     * 4.2分流运抵
     */
    public static final String Arrival_Ship_Distribute="MT3102";
    public static final String Arrival_Air_Distribute ="MT3202";


    /**
     * 5 装载舱单
     */
    public static final String Load_Ship="MT4101";
    public static final String Load_Air ="MT4201";


    /**
     * 6 分拨申请
     */
    public static final String Dispatch_Ship="MT6102";
    public static final String Dispatch_Air ="MT6202";


    /**
     * 7 分流申请
     */
    public static final String Distribute_Ship="MT6101";
    public static final String Distribute_Air ="MT6201";


    /**
     * 8装箱清单
     */
    public static final String Packing_Ship="MT7101";


    /**
     * 9改靠港申请
     */
    public static final String Change_Port_Ship="MT8101";
    public static final String Change_Port_Air ="MT8201";


    /**
     * 10直接改配申请
     */
    public static final String Change_Transport_Ship="MT8104";
    public static final String Change_Transport_Air ="MT8204";


    /**
     * 11落装申请
     */
    public static final String Off_Load_Ship="MT8102";
    public static final String Off_Load_Air ="MT8202";


    /**
     * 12落装改配申请
     */
    public static final String Change_Transport_Off_Load_Ship ="MT8103";
    public static final String Change_Transport_Off_Load_Air  ="MT8203";



    /**
     * 13国际转运准单
     */
    public static final String Transfer_Check_Ship="MT8105";
    public static final String Transfer_Check_Air ="MT8205";


    /**
     * 14空箱快速验放
     */
    public static final String EmptyConta_Import ="MTECIM";
    public static final String EmptyConta_Export ="MTECEX";



    /**
     * 未知数据报文标识
     */
    public static final String UNKNOWDATA="MFT_UNKONW_DATA";
    public static String getUnknowdata() {
        return UNKNOWDATA;
    }


}

