package co.edu.co.uco.generales.domain;

public interface DomainRule<T> {

	void execute(T data);
}
