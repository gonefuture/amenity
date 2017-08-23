package cn.zhku.amenity.shiro;

import cn.zhku.amenity.po.entity.*;
import cn.zhku.amenity.po.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author 钱伟健 gonefutre
 * @date 2017/8/1 10:29.
 * @E-mail gonefuture@qq.com
 */
@Service
public class ShiroService {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    TeacherMapper teacherMapper;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    PermissionRoleMapper permissionRoleMapper;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    RoleTeacherMapper roleTeacherMapper;

    public Set<String> findRoleIds(String ybEmployid) {

        Set<String> roleIdsSet = new HashSet<String>();
        RoleTeacherExample roleTeacherExample = new RoleTeacherExample();
        roleTeacherExample.or().andYbEmployidEqualTo(ybEmployid);
        List<RoleTeacher> adminRoleList = roleTeacherMapper.selectByExample(roleTeacherExample);
        for(RoleTeacher roleTeacher : adminRoleList) {
            roleIdsSet.add(roleTeacher.getRoleId().toString());

        }
        return roleIdsSet;
    }


    public Set<String> findAuthorities(Set<String> roleIds) {
        Set<String> permissionSet = new HashSet<String>();
        for (String roleId : roleIds) {
            PermissionRoleExample permissionRoleExample = new  PermissionRoleExample();
            permissionRoleExample.or().andRoleIdEqualTo(Integer.valueOf(roleId));
            List<PermissionRole> permissionRoleList = permissionRoleMapper.selectByExample(permissionRoleExample);
            for (PermissionRole permissionRole: permissionRoleList ) {
                permissionSet.add(permissionRole.getPermissionId().toString());
                System.out.println("角色"+permissionRole.getRoleId());
                System.out.println("权限"+permissionRole.getPermissionId());
            }

        }
        return permissionSet;
    }

    public Teacher findByAdminId(String adminId) {
        return teacherMapper.selectByPrimaryKey(adminId);
    }
}
