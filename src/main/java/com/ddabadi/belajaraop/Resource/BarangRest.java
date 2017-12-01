package com.ddabadi.belajaraop.Resource;

import com.ddabadi.belajaraop.domain.Barang;
import com.ddabadi.belajaraop.trans.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: deddy
 * Date: 12/1/17
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class BarangRest {

    @Autowired private BarangService barangService;

    @RequestMapping(value = "barang")
    public Barang getBarang(){
        return barangService.getBarang();
    }

}
