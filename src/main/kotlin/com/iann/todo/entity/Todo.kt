package com.iann.todo.entity

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.NoArgsConstructor
import org.hibernate.annotations.DynamicUpdate
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.sql.Date
import java.sql.Timestamp

@Entity
@DynamicUpdate
class Todo (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val todoId: Long? = null,

    @Column(length = 20, nullable = false)
    var title: String,

    @Column(length = 200)
    var desc: String,

    @Column(nullable = false)
    var status: String,

    @Column(nullable = false)
    var startDate: Date,

    @Column(nullable = false)
    var endDate: Date
){
}