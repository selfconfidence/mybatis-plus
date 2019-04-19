package com.ml.mybatis.plus.mybatis_plus.data;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * @author mister_wei
 * @version 1.1.1
 * @title web_service
 * @package com.ml.mybatis.plus.mybatis_plus.data
 * @date 2019/4/18 20:41
 */
@Data
@TableName("test_stu")
public class Student extends Model<Student> {
    @TableId(type = IdType.ID_WORKER)
    private Integer id;
    private String styName;
    private Integer styAge;

    public Integer getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id.intValue();
    }

    public String getStyName() {
        return styName;
    }

    public void setStyName(String styName) {
        this.styName = styName;
    }

    public Integer getStyAge() {
        return styAge;
    }

    public void setStyAge(Integer styAge) {
        this.styAge = styAge;
    }
}
