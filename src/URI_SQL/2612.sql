SELECT DISTINCT m.id, m.name 
FROM movies m 
    JOIN movies_actors m_a ON m.id = m_a.id_movies 
    JOIN actors a ON a.id = m_a.id_actors 
    JOIN genres g ON g.id = m.id_genres 
WHERE a.name IN ('Miguel Silva','Marcelo Silva') AND g.description = 'Action';   