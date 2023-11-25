package com.vnpay.Controller;

import com.vnpay.Service.VnPayService;
import com.vnpay.model.Dto;
import com.vnpay.model.ResPaymentDto;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;


@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
public class VnpayController {

    private final VnPayService vnPayService;
    @CrossOrigin
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Dto dto,
            HttpServletRequest request) throws UnsupportedEncodingException {
        String vnpayUrl = vnPayService.create(Integer.parseInt(dto.getAmount()), dto.getOrderinfo(),request);
        ResPaymentDto resPaymentDto = new ResPaymentDto();
        resPaymentDto.setStatus("OK");
        resPaymentDto.setMessage("Successfully!");
        resPaymentDto.setURL(vnpayUrl);
        return ResponseEntity.ok(resPaymentDto);
    }
}
