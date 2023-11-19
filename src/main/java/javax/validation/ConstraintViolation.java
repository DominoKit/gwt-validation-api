/*
 * Jakarta Bean Validation API
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package javax.validation;

import javax.validation.metadata.ConstraintDescriptor;

/**
 * Describes a constraint violation. This object exposes the constraint
 * violation context as well as the message describing the violation.
 *
 * @param <T> the type of the root bean
 *
 * @author Emmanuel Bernard
 */
public interface ConstraintViolation<T> {

	/**
	 * @return the interpolated error message for this constraint violation
	 */
	String getMessage();

	/**
	 * @return the non-interpolated error message for this constraint violation
	 */
	String getMessageTemplate();

	/**
	 * Returns the root bean being validated. For method validation, returns
	 * the object the method is executed on.
	 * <p>
	 * Returns {@code null} when:
	 * <ul>
	 *     <li>the {@code ConstraintViolation} is returned after calling
	 *     {@link Validator#validateValue(Class, String, Object, Class[])}</li>
	 *     <li>the {@code ConstraintViolation} is returned after validating a
	 *     constructor.</li>
	 * </ul>
	 *
	 * @return the validated object, the object hosting the validated element or {@code null}
	 */
	T getRootBean();

	/**
	 * Returns the class of the root bean being validated.
	 * For method validation, this is the object class the
	 * method is executed on.
	 * For constructor validation, this is the class the constructor
	 * is declared on.
	 *
	 * @return the class of the root bean or of the object hosting the validated element
	 */
	Class<T> getRootBeanClass();

	/**
	 * Returns:
	 * <ul>
	 *     <li>the bean instance the constraint is applied on if it is
	 *     a bean constraint</li>
	 *     <li>the bean instance hosting the property the constraint
	 *     is applied on if it is a property constraint or a container element constraint
	 *     hosted on a property</li>
	 *     <li>{@code null} when the {@code ConstraintViolation} is returned
	 *     after calling {@link Validator#validateValue(Class, String, Object, Class[])}
	 *     </li>
	 *     <li>the object the method is executed on if it is
	 *     a method parameter, cross-parameter or return value constraint or a
	 *     container element constraint hosted on a method parameter or return value</li>
	 *     <li>{@code null} if it is a constructor parameter or
	 *     cross-parameter constraint or a container element constraint hosted on a
	 *     constructor parameter</li>
	 *     <li>the object the constructor has created if it is a
	 *     constructor return value constraint</li>
	 * </ul>
	 *
	 * @return the leaf bean
	 */
	Object getLeafBean();

	/**
	 * Returns an {@code Object[]} representing the constructor or method invocation
	 * arguments if the {@code ConstraintViolation} is returned after validating the
	 * method or constructor parameters.
	 * Returns {@code null} otherwise.
	 *
	 * @return parameters of the method or constructor invocation or {@code null}
	 *
	 * @since 1.1
	 */
	Object[] getExecutableParameters();

	/**
	 * Returns the return value of the constructor or method invocation
	 * if the {@code ConstraintViolation} is returned after validating the method
	 * or constructor return value.
	 * <p>
	 * Returns {@code null} if the method has no return value.
	 * Returns {@code null} otherwise.
	 *
	 * @return the method or constructor return value or {@code null}
	 *
	 * @since 1.1
	 */
	Object getExecutableReturnValue();

	/**
	 * @return the property path to the value from {@code rootBean}
	 */
	Path getPropertyPath();

	/**
	 * Returns the value failing to pass the constraint.
	 * For cross-parameter constraints, an {@code Object[]} representing
	 * the method invocation arguments is returned.
	 *
	 * @return the value failing to pass the constraint
	 */
	Object getInvalidValue();

	/**
	 * Returns the constraint metadata reported to fail.
	 * The returned instance is immutable.
	 *
	 * @return constraint metadata
	 */
	ConstraintDescriptor<?> getConstraintDescriptor();

	/**
	 * Returns an instance of the specified type allowing access to
	 * provider-specific APIs. If the Jakarta Bean Validation provider
	 * implementation does not support the specified class,
	 * {@link ValidationException} is thrown.
	 *
	 * @param type the class of the object to be returned
	 * @param <U> the type of the object to be returned
	 * @return an instance of the specified class
	 * @throws ValidationException if the provider does not support the call
	 *
	 * @since 1.1
	 */
	<U> U unwrap(Class<U> type);
}
