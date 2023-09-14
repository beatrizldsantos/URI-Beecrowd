SELECT c.name, r.rentals_date 
FROM customers c JOIN rentals r ON c.id = r.id_customers
WHERE EXTRACT (month FROM r.rentals_date) = 9 AND EXTRACT (year FROM r.rentals_date) = 2016;