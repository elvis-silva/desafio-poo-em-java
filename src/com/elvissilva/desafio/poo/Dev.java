package com.elvissilva.desafio.poo;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Content> currentContents = new LinkedHashSet<>();
    private Set<Content> concludedContents = new LinkedHashSet<>();

    public void bootcampInscribe(Bootcamp bootcamp) {
        this.currentContents.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void progress() {
        Optional<Content> content = this.currentContents.stream().findFirst();
        if(content.isPresent()) {
            this.concludedContents.add(content.get());
            this.currentContents.remove(content.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calculateTotalXP() {
        return this.concludedContents
                .stream()
                .mapToDouble(Content::calculateXP)
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getCurrentContents() {
        return currentContents;
    }

    public void setCurrentContents(Set<Content> currentContents) {
        this.currentContents = currentContents;
    }

    public Set<Content> getConcludedContents() {
        return concludedContents;
    }

    public void setConcludedContents(Set<Content> concludedContents) {
        this.concludedContents = concludedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) &&
                Objects.equals(currentContents, dev.currentContents) &&
                Objects.equals(concludedContents, dev.concludedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, currentContents, concludedContents);
    }
}
