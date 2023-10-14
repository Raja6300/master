package org.application.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="iPhone_table")
public class IPhone {
    @Id
    @Column(name="iPhone_id")
    Long id;
    @Column(name="iPhone_modelName")
    String modelName;
    @Column(name="iPhone_price")
    Long price;
    @Column(name="iPhone_mocameraPixels")
    float cameraPixels;


}

