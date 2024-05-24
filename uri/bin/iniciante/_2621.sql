select products.name
from products
    inner join providers
    on products.id_providers = providers.id
where products.amount between 10 and 20
    and providers.name like 'P%';