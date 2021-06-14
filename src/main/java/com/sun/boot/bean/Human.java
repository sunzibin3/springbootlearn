package com.sun.boot.bean;

import lombok.*;

@NoArgsConstructor //生成无参构造器
@AllArgsConstructor //生成有参构造器
@ToString //生成to_string方法
@Data //生成get set方法
@EqualsAndHashCode //重写HashCode方法
public class Human {
    private String name;
    private String age;
}
