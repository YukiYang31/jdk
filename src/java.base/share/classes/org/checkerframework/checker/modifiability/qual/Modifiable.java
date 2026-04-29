package org.checkerframework.checker.modifiability.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Convenience alias meaning {@code @Growable @Shrinkable @Replaceable}. Calling grow, shrink, and
 * replace operations such as {@code add}, {@code remove}, {@code set}, etc. on this collection will
 * not result in throwing {@link UnsupportedOperationException}.
 *
 * <p>This annotation is not part of the type hierarchy; the Modifiability Checker expands it to
 * {@code @Growable @Shrinkable @Replaceable} on each annotated type.
 * 
 * <p>Some Java types lack methods for certain kinds of mutation. For these types, the Modifiability Checker defaults
 * them to {@code @Unknown}:
 * <ul> {@code @Modifiable Iterator<>} is treated as {@code @UnknownGrow @Shrinkable @UnknownReplace Iterator}. </ul>
 * <ul> {@code @Modifiable Set<>} is treated as {@code @Growable @Shrinkable @UnknownReplace Set}. </ul>
 * <ul> {@code @Modifiable Queue<>} is treated as {@code @Growable @Shrinkable @UnknownReplace Queue}. </ul>
 * <ul> {@code Map.@Modifiable Entry<>} is treated as {@code @UnknownGrow @UnknownShrink @Replaceable List}. </ul>
 *
 * @checker_framework.manual #modifiability-checker Modifiability Checker
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface Modifiable {}
