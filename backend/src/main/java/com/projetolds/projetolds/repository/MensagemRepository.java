package com.projetolds.projetolds.repository;

import com.projetolds.projetolds.model.Atendimento;
import com.projetolds.projetolds.model.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
    List<Mensagem> findByAtendimento(Atendimento atendimento);
}
