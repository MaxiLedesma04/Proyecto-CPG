package com.CLUBPG.SocialNetworking.repositories;

import com.CLUBPG.SocialNetworking.models.Usuario;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends Neo4jRepository<Usuario, Long> {
}
