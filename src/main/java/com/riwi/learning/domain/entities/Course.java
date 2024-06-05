package com.riwi.learning.domain.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String courseName;
    @Column(columnDefinition = "TEXT")
    private String courseDescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_id", referencedColumnName = "id")
    private User instructorId;

    @OneToMany(mappedBy = "courseId", fetch = FetchType.EAGER, orphanRemoval = false, cascade = CascadeType.ALL)
    @Builder.Default
    private List<Enrollment> enrollments= new ArrayList<>();

    @OneToMany(mappedBy = "courseId", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = false)
    @Builder.Default
    private List<Lesson> lessons = new ArrayList<>();

    @OneToMany(mappedBy = "courseId", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = false)
    @Builder.Default
    private List<Message> messages=new ArrayList<>();
}
