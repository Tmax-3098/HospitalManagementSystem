package com.saturn.hospitalManagement.dto;

import com.saturn.hospitalManagement.entity.type.BloodGroupType;
import lombok.Data;

@Data
public class BloodGroupStats {

    private final BloodGroupType bloodGroupType;

    private final Long count;
}
