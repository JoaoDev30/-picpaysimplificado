package com.picpaysimplificado.dtos;
import java.math.BigDecimal;
public record TransactionDTO(Long senderId,Long receiverId,BigDecimal value ) {
}
