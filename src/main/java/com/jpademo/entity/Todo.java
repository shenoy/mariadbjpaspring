package com.jpademo.entity;


import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "todos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public final class Todo {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Version
    private long version;


    //The constructor, builder, and other methods are omitted
}