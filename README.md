## Product Sorting System
# Overview
This Java application demonstrates how to manage and sort a list of products using:

Interfaces and inheritance

Custom comparators

The Comparable interface

User input for sorting selection

The goal is to allow users to sort a predefined list of products by different criteria: price, rating, or popularity.

# Project Structure
*Product*
Represents a product with attributes:

id (used for natural ordering)

name

price

rating

popularity (e.g. "popular", "very popular")

Implements Comparable<Product> to allow sorting by ID.

*ProductSortingService*
Handles the sorting logic:

Prompts user input (via console)

Sorts the product list by the chosen criterion using custom comparators

Implements the ProductSorter interface.

*User*
Contains static utility methods to perform sorting by:

*PriceComparator*
*RatingComparator*
*PopularityComparator*


Comparators
Each comparator implements Comparator<Product>:

PriceComparator: sorts by price

RatingComparator: sorts by rating

PopularityComparator: sorts alphabetically by popularity

