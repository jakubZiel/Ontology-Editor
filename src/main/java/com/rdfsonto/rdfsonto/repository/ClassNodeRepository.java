package com.rdfsonto.rdfsonto.repository;

import com.rdfsonto.rdfsonto.model.ClassNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClassNodeRepository extends Neo4jRepository<ClassNode, Long> {

    @Query("MATCH (n:Resource)-[]->(neighbour) where id(n) = $nodeId")
    List<Long> findAllNeighbourIds(@Param("nodeId") long id);

    @Query("MATCH (n:Resource) WHERE id(n) = $nodeId UNWIND keys(n) AS prop RETURN prop")
    List<String> getAllNodeProperties(@Param("nodeId") long id);

    @Query("MATCH (n:Resource) WHERE id(n) = $nodeId UNWIND keys(n) AS prop RETURN val: n[prop], key: prop ")
    List<Object> getAllNodeValues(@Param("nodeId") long id);
}
