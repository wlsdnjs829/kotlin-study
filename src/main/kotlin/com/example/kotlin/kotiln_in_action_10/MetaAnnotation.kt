package com.example.kotlin.kotiln_in_action_10

@Target(allowedTargets = [AnnotationTarget.ANNOTATION_CLASS])
annotation class BindingAnnotation

@BindingAnnotation
annotation class MyBinding