package com.herika.younglearn.repository

import com.herika.younglearn.model.Dog

interface DogsRepository {
    fun getBreeds(): List<Dog>
}
