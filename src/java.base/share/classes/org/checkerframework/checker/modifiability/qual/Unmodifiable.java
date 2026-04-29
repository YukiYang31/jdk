package org.checkerframework.checker.modifiability.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Convenience alias meaning {@code @Ungrowable @Unshrinkable @Unreplaceable}. Calling any mutating
 * operation on this collection (growing, shrinking, or replacing) will throw {@link
 * UnsupportedOperationException}.
 *
 * <p>This annotation is not part of the type hierarchy; the Modifiability Checker expands it to
 * {@code @Ungrowable @Unshrinkable @Unreplaceable} on each annotated type.
 * 
 * <p>Some Java types lack methods for certain kinds of mutation. For these types, the Modifiability Checker defaults
 * them to {@code @Unknown}:
 * <ul> {@code @Unmodifiable Iterator<>} is treated as {@code @UnknownGrow @Unshrinkable @UnknownReplace Iterator}. </ul>
 * <ul> {@code @Unmodifiable Set<>} is treated as {@code @Ungrowable @Unshrinkable @UnknownReplace Set}. </ul>
 * <ul> {@code @Unmodifiable Queue<>} is treated as {@code @Ungrowable @Unshrinkable @UnknownReplace Queue}. </ul>
 * <ul> {@code Map.@Unmodifiable Entry<>} is treated as {@code @UnknownGrow @UnknownShrink @Unreplaceable List}. </ul>
 *
 * @checker_framework.manual #modifiability-checker Modifiability Checker
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface Unmodifiable {}
