public interface IEntityRepository<T> {
    void add(T entity); //entity veri tabanı nesnesi anlamına gelir. Yani T tipinde bir entity.
    void delete(T entity);
    void update(T entity);
}
