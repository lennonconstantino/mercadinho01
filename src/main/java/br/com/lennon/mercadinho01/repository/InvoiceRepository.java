package br.com.lennon.mercadinho01.repository;


import br.com.lennon.mercadinho01.model.Invoice;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
    Optional<Invoice> findByInvoiceNumber(String invoiceNumber);
    List<Invoice> findAllByCustomerName(String customerName);
}
