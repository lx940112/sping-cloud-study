package com.lucas.cloud.swagger2.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Lucas
 */
@Data
@ApiModel(description = "用户信息")
public class User {
    @ApiModelProperty(value = "id", example = "1")
    private Long id;
    @ApiModelProperty(value = "name", example = "lucas")
    private String name;
    @ApiModelProperty(value = "age", example = "20")
    private Integer age;


}
