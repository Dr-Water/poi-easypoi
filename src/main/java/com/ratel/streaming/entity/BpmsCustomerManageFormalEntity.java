package com.ratel.streaming.entity;

/**
 * @业务描述：
 * @package_name： com.ratel.streaming.entity
 * @project_name： poi-easypoi
 * @author： ratelfu@qq.com
 * @create_time： 2019-12-05 14:18
 * @copyright (c) ratelfu 版权所有
 */

import java.io.Serializable;
import java.util.Date;


public class BpmsCustomerManageFormalEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 物理主键
     */

    private Integer id;
    /**
     * 客户编号
     */
    private String customerCode;
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 客户更名原因
     */
    private String customerRenameReasons;
    /**
     * 客户更名原因编码
     */
    private String customerRenameReasonsCode;
    /**
     * 客户更名其他原因
     */
    private String customerRenameOtherReasons;
    /**
     * 变更原因
     */
    private String changeReasons;
    /**
     * 客户归属
     */
    private String customerBelongs;
    /**
     * 客户归属编码
     */
    private String customerBelongsCode;
    /**
     * 客户类型
     */
    private String customerType;
    /**
     * 客户类型编码
     */
    private String customerTypeCode;
    /**
     * 主行业
     */
    private String mainIndustry;
    /**
     * 主行业编码
     */
    private String mainIndustryCode;
    /**
     * 一级子行业
     */
    private String oneClassSubIndustry;
    /**
     * 一级子行业编码
     */
    private String oneClassSubIndustryCode;
    /**
     * 二级子行业
     */
    private String twoClassSubIndustry;
    /**
     * 二级子行业编码
     */
    private String twoClassSubIndustryCode;
    /**
     * 省
     */
    private String province;
    /**
     * 市
     */
    private String city;
    /**
     * 区
     */
    private String district;
    /**
     * 省编码
     */
    private String provinceCode;
    /**
     * 市编码
     */
    private String cityCode;
    /**
     * 区编码
     */
    private String districtCode;
    /**
     * 区县经理级别
     */
    private String managerLevel;
    /**
     * 物理分区
     */
    private String physicalPartitions;
    /**
     * 统一社会信用代码
     */
    private String socialCreditCode;
    /**
     * 客户成熟度
     */
    private String customerMaturity;
    /**
     * 客户成熟度编码
     */
    private String customerMaturityCode;
    /**
     * 员工数量
     */
    private Integer employeeNumber;
    /**
     * 客户管理标签
     */
    private String managementLabel;
    /**
     * 客户管理标签编码
     */
    private String managementLabelCode;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 状态
     */
    private String status;
    /**
     * 状态编码:1储备2正式
     */
    private String statusCode;
    /**
     * 创建人ITcode
     */
    private String createrItcode;
    /**
     * 是否删除【0未删除，1删除】
     */
    private String isDelete;
    /**
     * 组织
     */
    private String orgName;
    /**
     * 组织ID
     */
    private Integer orgId;
    /**
     * 创建人
     */
    private String createrName;
    /**
     * 创建人ID
     */
    private Integer createrId;
    /**
     * 创建时间
     */
    private Date createrTime;
    /**
     * 修改人
     */
    private String modifyName;
    /**
     * 修改人ID
     */
    private Integer modifyId;
    /**
     * 修改时间
     */
    private Date modifyTime;
    /**
     * CDBID
     */
    private String cdbid;
    /**
     * 经营状态
     */
    private String managementState;
    /**
     * 法定代表人
     */
    private String legalRepresentative;
    /**
     * 注册资本（万元）
     */
    private String registeredCapital;
    /**
     * 网址
     */
    private String website;
    /**
     * 企业地址
     */
    private String enterpriseAddress;
    /**
     * 直属上级
     */
    private String immediateSuperior;
    /**
     * 母公司
     */
    private String parentCompany;
    /**
     * DCG在库客户CDBID
     */
    private String dcgLibraryCustomerCdbid;
    /**
     * DCG在库客户全称
     */
    private String dcgLibraryCustomerFullName;
    /**
     * DCG IS业务处
     */
    private String dcgIsBusinessOffice;
    /**
     * 所属行业
     */
    private String industry;
    /**
     * 销售
     */
    private String saler;
    /**
     * 销售id
     */
    private Integer salerId;

    /**
     * 设置：物理主键
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * 获取：物理主键
     */
    public Integer getId() {
        return id;
    }
    /**
     * 设置：客户编号
     */
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }
    /**
     * 获取：客户编号
     */
    public String getCustomerCode() {
        return customerCode;
    }
    /**
     * 设置：客户名称
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    /**
     * 获取：客户名称
     */
    public String getCustomerName() {
        return customerName;
    }
    /**
     * 设置：客户更名原因
     */
    public void setCustomerRenameReasons(String customerRenameReasons) {
        this.customerRenameReasons = customerRenameReasons;
    }
    /**
     * 获取：客户更名原因
     */
    public String getCustomerRenameReasons() {
        return customerRenameReasons;
    }
    /**
     * 设置：客户更名原因编码
     */
    public void setCustomerRenameReasonsCode(String customerRenameReasonsCode) {
        this.customerRenameReasonsCode = customerRenameReasonsCode;
    }
    /**
     * 获取：客户更名原因编码
     */
    public String getCustomerRenameReasonsCode() {
        return customerRenameReasonsCode;
    }
    /**
     * 设置：客户更名其他原因
     */
    public void setCustomerRenameOtherReasons(String customerRenameOtherReasons) {
        this.customerRenameOtherReasons = customerRenameOtherReasons;
    }
    /**
     * 获取：客户更名其他原因
     */
    public String getCustomerRenameOtherReasons() {
        return customerRenameOtherReasons;
    }
    /**
     * 设置：变更原因
     */
    public void setChangeReasons(String changeReasons) {
        this.changeReasons = changeReasons;
    }
    /**
     * 获取：变更原因
     */
    public String getChangeReasons() {
        return changeReasons;
    }
    /**
     * 设置：客户归属
     */
    public void setCustomerBelongs(String customerBelongs) {
        this.customerBelongs = customerBelongs;
    }
    /**
     * 获取：客户归属
     */
    public String getCustomerBelongs() {
        return customerBelongs;
    }
    /**
     * 设置：客户归属编码
     */
    public void setCustomerBelongsCode(String customerBelongsCode) {
        this.customerBelongsCode = customerBelongsCode;
    }
    /**
     * 获取：客户归属编码
     */
    public String getCustomerBelongsCode() {
        return customerBelongsCode;
    }
    /**
     * 设置：客户类型
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
    /**
     * 获取：客户类型
     */
    public String getCustomerType() {
        return customerType;
    }
    /**
     * 设置：客户类型编码
     */
    public void setCustomerTypeCode(String customerTypeCode) {
        this.customerTypeCode = customerTypeCode;
    }
    /**
     * 获取：客户类型编码
     */
    public String getCustomerTypeCode() {
        return customerTypeCode;
    }
    /**
     * 设置：主行业
     */
    public void setMainIndustry(String mainIndustry) {
        this.mainIndustry = mainIndustry;
    }
    /**
     * 获取：主行业
     */
    public String getMainIndustry() {
        return mainIndustry;
    }
    /**
     * 设置：主行业编码
     */
    public void setMainIndustryCode(String mainIndustryCode) {
        this.mainIndustryCode = mainIndustryCode;
    }
    /**
     * 获取：主行业编码
     */
    public String getMainIndustryCode() {
        return mainIndustryCode;
    }
    /**
     * 设置：一级子行业
     */
    public void setOneClassSubIndustry(String oneClassSubIndustry) {
        this.oneClassSubIndustry = oneClassSubIndustry;
    }
    /**
     * 获取：一级子行业
     */
    public String getOneClassSubIndustry() {
        return oneClassSubIndustry;
    }
    /**
     * 设置：一级子行业编码
     */
    public void setOneClassSubIndustryCode(String oneClassSubIndustryCode) {
        this.oneClassSubIndustryCode = oneClassSubIndustryCode;
    }
    /**
     * 获取：一级子行业编码
     */
    public String getOneClassSubIndustryCode() {
        return oneClassSubIndustryCode;
    }
    /**
     * 设置：二级子行业
     */
    public void setTwoClassSubIndustry(String twoClassSubIndustry) {
        this.twoClassSubIndustry = twoClassSubIndustry;
    }
    /**
     * 获取：二级子行业
     */
    public String getTwoClassSubIndustry() {
        return twoClassSubIndustry;
    }
    /**
     * 设置：二级子行业编码
     */
    public void setTwoClassSubIndustryCode(String twoClassSubIndustryCode) {
        this.twoClassSubIndustryCode = twoClassSubIndustryCode;
    }
    /**
     * 获取：二级子行业编码
     */
    public String getTwoClassSubIndustryCode() {
        return twoClassSubIndustryCode;
    }
    /**
     * 设置：省
     */
    public void setProvince(String province) {
        this.province = province;
    }
    /**
     * 获取：省
     */
    public String getProvince() {
        return province;
    }
    /**
     * 设置：市
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * 获取：市
     */
    public String getCity() {
        return city;
    }
    /**
     * 设置：区
     */
    public void setDistrict(String district) {
        this.district = district;
    }
    /**
     * 获取：区
     */
    public String getDistrict() {
        return district;
    }
    /**
     * 设置：省编码
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
    /**
     * 获取：省编码
     */
    public String getProvinceCode() {
        return provinceCode;
    }
    /**
     * 设置：市编码
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
    /**
     * 获取：市编码
     */
    public String getCityCode() {
        return cityCode;
    }
    /**
     * 设置：区编码
     */
    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }
    /**
     * 获取：区编码
     */
    public String getDistrictCode() {
        return districtCode;
    }
    /**
     * 设置：区县经理级别
     */
    public void setManagerLevel(String managerLevel) {
        this.managerLevel = managerLevel;
    }
    /**
     * 获取：区县经理级别
     */
    public String getManagerLevel() {
        return managerLevel;
    }
    /**
     * 设置：物理分区
     */
    public void setPhysicalPartitions(String physicalPartitions) {
        this.physicalPartitions = physicalPartitions;
    }
    /**
     * 获取：物理分区
     */
    public String getPhysicalPartitions() {
        return physicalPartitions;
    }
    /**
     * 设置：统一社会信用代码
     */
    public void setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode;
    }
    /**
     * 获取：统一社会信用代码
     */
    public String getSocialCreditCode() {
        return socialCreditCode;
    }
    /**
     * 设置：客户成熟度
     */
    public void setCustomerMaturity(String customerMaturity) {
        this.customerMaturity = customerMaturity;
    }
    /**
     * 获取：客户成熟度
     */
    public String getCustomerMaturity() {
        return customerMaturity;
    }
    /**
     * 设置：客户成熟度编码
     */
    public void setCustomerMaturityCode(String customerMaturityCode) {
        this.customerMaturityCode = customerMaturityCode;
    }
    /**
     * 获取：客户成熟度编码
     */
    public String getCustomerMaturityCode() {
        return customerMaturityCode;
    }
    /**
     * 设置：员工数量
     */
    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    /**
     * 获取：员工数量
     */
    public Integer getEmployeeNumber() {
        return employeeNumber;
    }
    /**
     * 设置：客户管理标签
     */
    public void setManagementLabel(String managementLabel) {
        this.managementLabel = managementLabel;
    }
    /**
     * 获取：客户管理标签
     */
    public String getManagementLabel() {
        return managementLabel;
    }
    /**
     * 设置：客户管理标签编码
     */
    public void setManagementLabelCode(String managementLabelCode) {
        this.managementLabelCode = managementLabelCode;
    }
    /**
     * 获取：客户管理标签编码
     */
    public String getManagementLabelCode() {
        return managementLabelCode;
    }
    /**
     * 设置：备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    /**
     * 获取：备注
     */
    public String getRemarks() {
        return remarks;
    }
    /**
     * 设置：状态
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * 获取：状态
     */
    public String getStatus() {
        return status;
    }
    /**
     * 设置：状态编码:1储备2正常
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
    /**
     * 获取：状态编码:1储备2正常
     */
    public String getStatusCode() {
        return statusCode;
    }
    /**
     * 设置：创建人ITcode
     */
    public void setCreaterItcode(String createrItcode) {
        this.createrItcode = createrItcode;
    }
    /**
     * 获取：创建人ITcode
     */
    public String getCreaterItcode() {
        return createrItcode;
    }
    /**
     * 设置：是否删除【0未删除，1删除】
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
    /**
     * 获取：是否删除【0未删除，1删除】
     */
    public String getIsDelete() {
        return isDelete;
    }
    /**
     * 设置：组织
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    /**
     * 获取：组织
     */
    public String getOrgName() {
        return orgName;
    }
    /**
     * 设置：组织ID
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }
    /**
     * 获取：组织ID
     */
    public Integer getOrgId() {
        return orgId;
    }
    /**
     * 设置：创建人
     */
    public void setCreaterName(String createrName) {
        this.createrName = createrName;
    }
    /**
     * 获取：创建人
     */
    public String getCreaterName() {
        return createrName;
    }
    /**
     * 设置：创建人ID
     */
    public void setCreaterId(Integer createrId) {
        this.createrId = createrId;
    }
    /**
     * 获取：创建人ID
     */
    public Integer getCreaterId() {
        return createrId;
    }
    /**
     * 设置：创建时间
     */
    public void setCreaterTime(Date createrTime) {
        this.createrTime = createrTime;
    }
    /**
     * 获取：创建时间
     */
    public Date getCreaterTime() {
        return createrTime;
    }
    /**
     * 设置：修改人
     */
    public void setModifyName(String modifyName) {
        this.modifyName = modifyName;
    }
    /**
     * 获取：修改人
     */
    public String getModifyName() {
        return modifyName;
    }
    /**
     * 设置：修改人ID
     */
    public void setModifyId(Integer modifyId) {
        this.modifyId = modifyId;
    }
    /**
     * 获取：修改人ID
     */
    public Integer getModifyId() {
        return modifyId;
    }
    /**
     * 设置：修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
    /**
     * 获取：修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }
    /**
     * 设置：CDBID
     */
    public void setCdbid(String cdbid) {
        this.cdbid = cdbid;
    }
    /**
     * 获取：CDBID
     */
    public String getCdbid() {
        return cdbid;
    }
    /**
     * 设置：经营状态
     */
    public void setManagementState(String managementState) {
        this.managementState = managementState;
    }
    /**
     * 获取：经营状态
     */
    public String getManagementState() {
        return managementState;
    }
    /**
     * 设置：法定代表人
     */
    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }
    /**
     * 获取：法定代表人
     */
    public String getLegalRepresentative() {
        return legalRepresentative;
    }
    /**
     * 设置：注册资本（万元）
     */
    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }
    /**
     * 获取：注册资本（万元）
     */
    public String getRegisteredCapital() {
        return registeredCapital;
    }
    /**
     * 设置：网址
     */
    public void setWebsite(String website) {
        this.website = website;
    }
    /**
     * 获取：网址
     */
    public String getWebsite() {
        return website;
    }
    /**
     * 设置：企业地址
     */
    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }
    /**
     * 获取：企业地址
     */
    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }
    /**
     * 设置：直属上级
     */
    public void setImmediateSuperior(String immediateSuperior) {
        this.immediateSuperior = immediateSuperior;
    }
    /**
     * 获取：直属上级
     */
    public String getImmediateSuperior() {
        return immediateSuperior;
    }
    /**
     * 设置：母公司
     */
    public void setParentCompany(String parentCompany) {
        this.parentCompany = parentCompany;
    }
    /**
     * 获取：母公司
     */
    public String getParentCompany() {
        return parentCompany;
    }
    /**
     * 设置：DCG在库客户CDBID
     */
    public void setDcgLibraryCustomerCdbid(String dcgLibraryCustomerCdbid) {
        this.dcgLibraryCustomerCdbid = dcgLibraryCustomerCdbid;
    }
    /**
     * 获取：DCG在库客户CDBID
     */
    public String getDcgLibraryCustomerCdbid() {
        return dcgLibraryCustomerCdbid;
    }
    /**
     * 设置：DCG在库客户全称
     */
    public void setDcgLibraryCustomerFullName(String dcgLibraryCustomerFullName) {
        this.dcgLibraryCustomerFullName = dcgLibraryCustomerFullName;
    }
    /**
     * 获取：DCG在库客户全称
     */
    public String getDcgLibraryCustomerFullName() {
        return dcgLibraryCustomerFullName;
    }
    /**
     * 设置：DCG IS业务处
     */
    public void setDcgIsBusinessOffice(String dcgIsBusinessOffice) {
        this.dcgIsBusinessOffice = dcgIsBusinessOffice;
    }
    /**
     * 获取：DCG IS业务处
     */
    public String getDcgIsBusinessOffice() {
        return dcgIsBusinessOffice;
    }
    /**
     * 获取：所属行业
     */
    public String getIndustry() {
        return industry;
    }
    /**
     * 设置：所属行业
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }
    /**
     * 获取：销售
     */
    public String getSaler() {
        return saler;
    }
    /**
     * 设置：销售
     */
    public void setSaler(String saler) {
        this.saler = saler;
    }
    /**
     * 获取：销售id
     */
    public Integer getSalerId() {
        return salerId;
    }
    /**
     * 设置：销售id
     */
    public void setSalerId(Integer salerId) {
        this.salerId = salerId;
    }

    @Override
    public String toString() {
        return "BpmsCustomerManageFormalEntity{" +
                "id=" + id +
                ", customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerRenameReasons='" + customerRenameReasons + '\'' +
                ", customerRenameReasonsCode='" + customerRenameReasonsCode + '\'' +
                ", customerRenameOtherReasons='" + customerRenameOtherReasons + '\'' +
                ", changeReasons='" + changeReasons + '\'' +
                ", customerBelongs='" + customerBelongs + '\'' +
                ", customerBelongsCode='" + customerBelongsCode + '\'' +
                ", customerType='" + customerType + '\'' +
                ", customerTypeCode='" + customerTypeCode + '\'' +
                ", mainIndustry='" + mainIndustry + '\'' +
                ", mainIndustryCode='" + mainIndustryCode + '\'' +
                ", oneClassSubIndustry='" + oneClassSubIndustry + '\'' +
                ", oneClassSubIndustryCode='" + oneClassSubIndustryCode + '\'' +
                ", twoClassSubIndustry='" + twoClassSubIndustry + '\'' +
                ", twoClassSubIndustryCode='" + twoClassSubIndustryCode + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", provinceCode='" + provinceCode + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", districtCode='" + districtCode + '\'' +
                ", managerLevel='" + managerLevel + '\'' +
                ", physicalPartitions='" + physicalPartitions + '\'' +
                ", socialCreditCode='" + socialCreditCode + '\'' +
                ", customerMaturity='" + customerMaturity + '\'' +
                ", customerMaturityCode='" + customerMaturityCode + '\'' +
                ", employeeNumber=" + employeeNumber +
                ", managementLabel='" + managementLabel + '\'' +
                ", managementLabelCode='" + managementLabelCode + '\'' +
                ", remarks='" + remarks + '\'' +
                ", status='" + status + '\'' +
                ", statusCode='" + statusCode + '\'' +
                ", createrItcode='" + createrItcode + '\'' +
                ", isDelete='" + isDelete + '\'' +
                ", orgName='" + orgName + '\'' +
                ", orgId=" + orgId +
                ", createrName='" + createrName + '\'' +
                ", createrId=" + createrId +
                ", createrTime=" + createrTime +
                ", modifyName='" + modifyName + '\'' +
                ", modifyId=" + modifyId +
                ", modifyTime=" + modifyTime +
                ", cdbid='" + cdbid + '\'' +
                ", managementState='" + managementState + '\'' +
                ", legalRepresentative='" + legalRepresentative + '\'' +
                ", registeredCapital='" + registeredCapital + '\'' +
                ", website='" + website + '\'' +
                ", enterpriseAddress='" + enterpriseAddress + '\'' +
                ", immediateSuperior='" + immediateSuperior + '\'' +
                ", parentCompany='" + parentCompany + '\'' +
                ", dcgLibraryCustomerCdbid='" + dcgLibraryCustomerCdbid + '\'' +
                ", dcgLibraryCustomerFullName='" + dcgLibraryCustomerFullName + '\'' +
                ", dcgIsBusinessOffice='" + dcgIsBusinessOffice + '\'' +
                ", industry='" + industry + '\'' +
                ", saler='" + saler + '\'' +
                ", salerId=" + salerId +
                '}';
    }
}

