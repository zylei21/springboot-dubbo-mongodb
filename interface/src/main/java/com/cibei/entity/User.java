package com.cibei.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/26 16:23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
}
