package com.ddabadi.belajaraop.trans;

import com.ddabadi.belajaraop.domain.Barang;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: deddy
 * Date: 12/1/17
 * Time: 9:15 PM
 * To change this template use File | Settings | File Templates.
 */

@Service
public class BarangService {

    private Barang barang;

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }
}
