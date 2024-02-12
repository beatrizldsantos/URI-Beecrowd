WITH node_children AS (
    SELECT 
        parent.node_id AS parent_node_id,
        COUNT(child.node_id) AS child_count
    FROM 
        nodes parent
    LEFT JOIN 
        nodes child ON parent.node_id = child.pointer
    GROUP BY 
        parent.node_id
),
node_parents AS (
    SELECT 
        child.node_id AS child_node_id,
        COUNT(parent.node_id) AS parent_count
    FROM 
        nodes child
    LEFT JOIN 
        nodes parent ON child.node_id = parent.pointer
    GROUP BY 
        child.node_id
),
node_types AS (
    SELECT 
        COALESCE(node_children.parent_node_id, node_parents.child_node_id) AS node_id,
        CASE 
            WHEN node_children.child_count = 2 THEN 'INNER'
            WHEN node_parents.parent_count = 0 THEN 'ROOT'
            ELSE 'LEAF'
        END AS node_type
    FROM 
        node_children
    FULL OUTER JOIN 
        node_parents ON node_children.parent_node_id = node_parents.child_node_id
)
SELECT * FROM node_types ORDER BY node_id;
