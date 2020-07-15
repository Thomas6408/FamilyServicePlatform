package com.mashibing.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 角色档案
 * </p>
 *
 * @author lian
 * @since 2020-07-11
 */
public class TblRole implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 角色编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色类型
     */
    private String roleType;

    /**
     * 操作权限
     */
    private String rolePrivileges;

    /**
     * 角色备注
     */
    private String roleRemark;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    public TblRole() {
    }

    public TblRole(Integer id, String roleName, String roleType, String rolePrivileges, String roleRemark, String createPerson, LocalDateTime createDate) {
        this.id = id;
        this.roleName = roleName;
        this.roleType = roleType;
        this.rolePrivileges = rolePrivileges;
        this.roleRemark = roleRemark;
        this.createPerson = createPerson;
        this.createDate = createDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getRolePrivileges() {
        return rolePrivileges;
    }

    public void setRolePrivileges(String rolePrivileges) {
        this.rolePrivileges = rolePrivileges;
    }

    public String getRoleRemark() {
        return roleRemark;
    }

    public void setRoleRemark(String roleRemark) {
        this.roleRemark = roleRemark;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "TblRole{" +
        "id=" + id +
        ", roleName=" + roleName +
        ", roleType=" + roleType +
        ", rolePrivileges=" + rolePrivileges +
        ", roleRemark=" + roleRemark +
        ", createPerson=" + createPerson +
        ", createDate=" + createDate +
        "}";
    }

    public TblRole getTblRole() {
    }
}
