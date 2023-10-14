package org.application.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class IPhoneDto {

    Long id;

    String modelName;

    Long price;

    float cameraPixels;

    int batteryPower;
}
