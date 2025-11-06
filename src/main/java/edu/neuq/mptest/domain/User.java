package edu.neuq.mptest.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String password;
    private Date date;
    private Long deleteTimestamp;
}