package uz.nt.userservice.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import shared.libs.dto.UserDto;

import java.sql.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardDto {
    private Integer id;
    private UserDto user;
    private CardTypeDto cardType;
    private String cardNumber;
    private Date validDate;
    private Double account;
}
