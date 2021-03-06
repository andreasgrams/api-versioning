/*
 * Copyright (C) open knowledge GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */
package de.openknowledge.sample.customer.application;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import de.openknowledge.sample.customer.domain.Customer;
import de.openknowledge.sample.customer.domain.Gender;
import de.openknowledge.sample.customer.domain.Name;

/**
 * An DTO that represents a {@link Customer}.
 */
@Schema(name = "Customer")
public class CustomerResourceType {

    @Schema(readOnly = true)
    private Long id;

    @Schema
    private Name name;

    private String emailAddress;

    private Gender gender;

    public CustomerResourceType() {
    }

    public CustomerResourceType(Customer customer) {
        this.id = customer.getId();
        this.name = customer.getName();
        this.emailAddress = customer.getEmailAddress();
        this.gender = customer.getGender();
    }

    public CustomerResourceType(Long id, Name name, String emailAddress, Gender gender) {
        this.id = id;
        this.name = name;
        this.emailAddress = emailAddress;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "CustomerResourceType{" +
                "id=" + id +
                ", name=" + name +
                ", emailAddress='" + emailAddress + '\'' +
                ", gender=" + gender +
                '}';
    }
}
