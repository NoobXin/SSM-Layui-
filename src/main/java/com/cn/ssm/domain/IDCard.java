package com.cn.ssm.domain;

public class IDCard {
    /**
     * 第一部分
     */
    private String ID;

    private String type;

    private String startTime;

    private String endTime;

    private String typeName;

    /**
     * 第二部分
     */
    private String dzsffsbh;//网约签注时是否申请地址变更

    private String wyjjrq;//网约取件时间

    private String jjr_xm;//取件人姓名

    private String jjr_lxdh;//取件联系电话

    private String jjr_dz;//取件地址

    private String jjtscg;//是否取件成功

    private String jjsbyy;//取件失败原因

    private String jjsj;//取件时间

    private String jjdh;//取件单号

    private String sjr_xm;//收件人

    private String sjr_lxdh;//收件人联系电话

    private String sjr_dz;//收件地址

    private String psrq;//配送日期

    private String psdh;//配送单号

    private String xgsj;//修改日期

    /**
     * 第三部分
     */
    private String yjmx_qzrq;//签注时间

    private String yjmx_sfps;//是否配送

    private String yjmx_pspc;//配送批次

    private String yjmx_qsrq;//签收日期

    private String yjmx_psdh;//配送单号

    public String getYjmx_qzrq() {
        return yjmx_qzrq;
    }

    public void setYjmx_qzrq(String yjmx_qzrq) {
        this.yjmx_qzrq = yjmx_qzrq;
    }

    public String getYjmx_sfps() {
        return yjmx_sfps;
    }

    public void setYjmx_sfps(String yjmx_sfps) {
        this.yjmx_sfps = yjmx_sfps;
    }

    public String getYjmx_pspc() {
        return yjmx_pspc;
    }

    public void setYjmx_pspc(String yjmx_pspc) {
        this.yjmx_pspc = yjmx_pspc;
    }

    public String getYjmx_qsrq() {
        return yjmx_qsrq;
    }

    public void setYjmx_qsrq(String yjmx_qsrq) {
        this.yjmx_qsrq = yjmx_qsrq;
    }

    public String getYjmx_psdh() {
        return yjmx_psdh;
    }

    public void setYjmx_psdh(String yjmx_psdh) {
        this.yjmx_psdh = yjmx_psdh;
    }

    private int page = 1;
    public void setPage(int page) {
        this.page = page;
    }
    public int getPage() {
        return page;
    }
    private int limit = 2;

    public int getLimit() {
        return limit;
    }
    public void setLimit(int limit) {
        this.limit = limit;
    }


    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDzsffsbh() {
        return dzsffsbh;
    }

    public void setDzsffsbh(String dzsffsbh) {
        this.dzsffsbh = dzsffsbh;
    }

    public String getWyjjrq() {
        return wyjjrq;
    }

    public void setWyjjrq(String wyjjrq) {
        this.wyjjrq = wyjjrq;
    }

    public String getJjr_xm() {
        return jjr_xm;
    }

    public void setJjr_xm(String jjr_xm) {
        this.jjr_xm = jjr_xm;
    }

    public String getJjr_lxdh() {
        return jjr_lxdh;
    }

    public void setJjr_lxdh(String jjr_lxdh) {
        this.jjr_lxdh = jjr_lxdh;
    }

    public String getJjr_dz() {
        return jjr_dz;
    }

    public void setJjr_dz(String jjr_dz) {
        this.jjr_dz = jjr_dz;
    }

    public String getJjtscg() {
        return jjtscg;
    }

    public void setJjtscg(String jjtscg) {
        this.jjtscg = jjtscg;
    }

    public String getJjsbyy() {
        return jjsbyy;
    }

    public void setJjsbyy(String jjsbyy) {
        this.jjsbyy = jjsbyy;
    }

    public String getJjsj() {
        return jjsj;
    }

    public void setJjsj(String jjsj) {
        this.jjsj = jjsj;
    }

    public String getJjdh() {
        return jjdh;
    }

    public void setJjdh(String jjdh) {
        this.jjdh = jjdh;
    }

    public String getSjr_xm() {
        return sjr_xm;
    }

    public void setSjr_xm(String sjr_xm) {
        this.sjr_xm = sjr_xm;
    }

    public String getSjr_lxdh() {
        return sjr_lxdh;
    }

    public void setSjr_lxdh(String sjr_lxdh) {
        this.sjr_lxdh = sjr_lxdh;
    }

    public String getSjr_dz() {
        return sjr_dz;
    }

    public void setSjr_dz(String sjr_dz) {
        this.sjr_dz = sjr_dz;
    }

    public String getPsrq() {
        return psrq;
    }

    public void setPsrq(String psrq) {
        this.psrq = psrq;
    }

    public String getPsdh() {
        return psdh;
    }

    public void setPsdh(String psdh) {
        this.psdh = psdh;
    }

    public String getXgsj() {
        return xgsj;
    }

    public void setXgsj(String xgsj) {
        this.xgsj = xgsj;
    }
}
