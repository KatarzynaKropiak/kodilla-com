package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;


    @Test
    void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item(new BigDecimal(199.99), 4);
        Item item2 = new Item(new BigDecimal(299.99), 3);
        Product product1 = new Product("Table");
        Product product2 = new Product("Chair");
        item1.setProduct(product1);
        item2.setProduct(product2);
        Invoice invoice1 = new Invoice("001/130422");
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);

        //When
        productDao.save(product1);
        productDao.save(product2);
        invoiceDao.save(invoice1);
        int id = invoice1.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }

}
