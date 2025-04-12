package ma.enset.studentsapp.repository;

import  ma.enset.studentsapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
