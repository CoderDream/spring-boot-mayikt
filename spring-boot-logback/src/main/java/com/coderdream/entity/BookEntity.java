package com.coderdream.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author ：xulin
 * @date ：Created in 2021/6/4 11:35
 * @description：
 * @modified By：
 * @version: $
 */
@Slf4j
@Data
public class BookEntity {
                                                              
    private String bookName;
    
    private Integer pages;

    @Override
    public String toString() {
        return "BookEntity [bookName=" + bookName + "， pages=" + pages + "]";
    }
    public static void main(String[] args) {
        BookEntity BookEntity = new BookEntity();
        BookEntity.setBookName("Spring Boot 核心思想");
        BookEntity.setPages(625);
        System.out.println(BookEntity.toString());
        log.info("####我是日志##########");
    }
}                                                                             