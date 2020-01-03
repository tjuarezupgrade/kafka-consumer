package com.upgrade.kafkapoc.kafkaconsumer.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SpectrumMessage {

    private String transaction;

    private String amount;

}
