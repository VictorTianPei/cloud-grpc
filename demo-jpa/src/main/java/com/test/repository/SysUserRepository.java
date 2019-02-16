/**   
* @Title: SysUserRepository.java 
* @Package cn.com.tp.domain 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年6月3日 上午11:05:36 
* @version V1.0   
*/
package com.test.repository;

import com.test.config.BaseRepository;
import com.test.domain.SysUser;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年6月3日]
 * @package cn.com.tp.domain
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年6月3日|tianpei|新增|SysUserRepository.java新增
*/
public interface SysUserRepository extends BaseRepository<SysUser>, JpaSpecificationExecutor<SysUser> {

    @Modifying
    @Query(value = "delete from sys_user where id in (:ids)", nativeQuery = true)
    void delSysUserByIds(@Param("ids") Long[] ids);
}
