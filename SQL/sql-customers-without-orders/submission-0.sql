-- Write your query below
Select name from customers
where name not in (
Select c.name
From customers c
Inner Join orders o ON o.customer_id = c.id
)
