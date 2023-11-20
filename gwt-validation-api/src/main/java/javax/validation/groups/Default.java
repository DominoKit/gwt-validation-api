/*
 * Jakarta Bean Validation API
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package javax.validation.groups;

/**
 * Default Jakarta Bean Validation group.
 *
 * <p>Unless a list of groups is explicitly defined:
 *
 * <ul>
 *   <li>constraints belong to the {@code Default} group
 *   <li>validation applies to the {@code Default} group
 * </ul>
 *
 * Most structural constraints should belong to the default group.
 *
 * @author Emmanuel Bernard
 */
public interface Default {}
