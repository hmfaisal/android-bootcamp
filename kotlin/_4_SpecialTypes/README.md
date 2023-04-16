## Array & Collection
This section discuss about array data structure and different collection types

### Collection

In Kotlin, collections are used to store and manipulate groups of objects or data. There are several types of collections available in Kotlin, including:

* Lists – Ordered collections of elements that allow duplicates.
* Sets – Unordered collections of unique elements.
* Maps – Collections of key-value pairs, where each key is unique.
* Arrays – Fixed-size collections of elements with a specific type.
* Sequences – Lazily evaluated collections of elements that can be processed in a pipeline.

With arrayList we can increase or decrease the size of an array as pre requisites. It also provide read and write functionalities.
### Types of Collection
In Kotlin collections are categorized into two forms.

* Immutable Collection
* Mutable Collection

#### Immutable Collection
It means that it supports only read-only functionalities and can not be modified its elements. Immutable Collections and their corresponding methods are:

* List – listOf() and listOf\<T>()
* Set – setOf()
* Map – mapOf()

#### Mutable Collection
It supports both read and write functionalities. Mutable collections and their corresponding methods are:

* List – mutableListOf(),arrayListOf() and ArrayList
* Set  – mutableSetOf(), hashSetOf()
* Map – mutableMapOf(), hashMapOf() and HashMap