/**   
* @Title: TestDao.java 
* @Package com.framework.msg.mapper 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2019年1月10日 下午4:36:15 
* @version V1.0   
*/
package com.test.mapper;

import com.test.jdbcconfig.Page;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2019年1月10日]
 * @package com.framework.msg.mapper
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2019年1月10日|tianpei|新增|TestDao.java新增
*/
//@Mapper
public interface TestDao {

    @Select("select * from sys_user;")
    public List<Map<String,Object>> find();

    @Select("select * from sys_user")
    public List<Map<String,Object>> selectPage(Page page);


    
    @Insert("insert into plf_help_main(help_id,sysid,help_typ,language_id,created_date,modified_date) "+
            "values(#{help_id},'1','2',1,now(),#{modified_date})")
    public int insert(@Param("help_id") int id, @Param("modified_date") Date date);
}
