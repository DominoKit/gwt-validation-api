/*
 * Jakarta Bean Validation API
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
/**
 * Top level package of the Jakarta Bean Validation API.
 *
 * <p>The main runtime artifacts are:
 *
 * <ul>
 *   <li>{@link javax.validation.Validation}: the entry point to bootstrap Jakarta Bean Validation
 *   <li>{@link javax.validation.ValidatorFactory}: the bootstrapped Jakarta Bean Validation engine
 *   <li>{@link javax.validation.Validator}: contract to validate beans and access the metadata
 *   <li>{@link javax.validation.ConstraintViolation}: constraint violation report
 * </ul>
 *
 * The main constraint definition artifacts are:
 *
 * <ul>
 *   <li>{@link javax.validation.Constraint}: annotation marking an annotation as being a constraint
 *   <li>{@link javax.validation.ConstraintValidator}: interface implemented by the piece of code
 *       validating a given constraint
 *   <li>{@link javax.validation.ReportAsSingleViolation}: marks a composed constraint as returning
 *       a single constraint violation report
 * </ul>
 *
 * The main constraint declaration artifacts are:
 *
 * <ul>
 *   <li>{@link javax.validation.Valid}: annotation marking an association as cascaded during
 *       validation
 *   <li>{@link javax.validation.GroupSequence}: defines a sequence of groups that should be
 *       validated sequentially
 * </ul>
 */
package javax.validation;
