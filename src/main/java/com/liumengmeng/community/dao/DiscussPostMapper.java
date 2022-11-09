package com.liumengmeng.community.dao;

import com.liumengmeng.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    //@Param注解用于给参数取别名
    //这个方法有且只有一个参数，且需要动态的条件，必须加别名。
    int selectDiscussPostRows(@Param("userId") int userId);

}
